package creationalpatterns.builder.concretebuilder;

import creationalpatterns.builder.builder.UIBuilder;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class EmpSrchBuilder extends UIBuilder {
    private JTextField txtUserName = new JTextField(16);
    private JTextField txtCity = new JTextField(16);
    private JTextField txtRenewal = new JTextField(16);

    @Override
    public void addUIControls() {
        searchUI = new JPanel();
        JLabel lblUserName = new JLabel("Name :");
        JLabel lblCity = new JLabel("City:");
        JLabel lblRenewal = new JLabel("Membership Renewal :");
        GridBagLayout gridbag = new GridBagLayout();
        searchUI.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        searchUI.add(lblUserName);
        searchUI.add(txtUserName);
        searchUI.add(lblCity);
        searchUI.add(txtCity);
        searchUI.add(lblRenewal);
        searchUI.add(txtRenewal);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblUserName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblCity, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblRenewal, gbc);
    }

    @Override
    public void initialize() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new java.util.Date());
        txtUserName.setText("Enter UserName Here");
        txtRenewal.setText((cal.get(Calendar.MONTH) + 1) + "/" +
                cal.get(Calendar.DATE) + "/" +
                cal.get(Calendar.YEAR));
    }

    @Override
    public String getSQL() {
        return ("Select * from Employer where Username='" +
                txtUserName.getText() + "'" + " and City='" +
                txtCity.getText() + "' and DateRenewal='" +
                txtRenewal.getText() + "'");
    }
}
