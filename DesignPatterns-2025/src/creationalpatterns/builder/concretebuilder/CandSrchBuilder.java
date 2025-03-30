package creationalpatterns.builder.concretebuilder;

import creationalpatterns.builder.builder.UIBuilder;

import javax.swing.*;
import java.awt.*;

public class CandSrchBuilder extends UIBuilder {
    private JTextField txtUserName = new JTextField(16);
    private JTextField txtSkill = new JTextField(16);
    private JComboBox cmbExperience = new JComboBox();

    @Override
    public void addUIControls() {
        searchUI = new JPanel();
        JLabel lblUserName = new JLabel("Name :");
        JLabel lblExperienceRange =
                new JLabel("Experience(min Yrs.):");
        JLabel lblSkill = new JLabel("Skill :");
        cmbExperience.addItem("<5");
        cmbExperience.addItem(">5");
        GridBagLayout gridbag = new GridBagLayout();
        searchUI.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        searchUI.add(lblUserName);
        searchUI.add(txtUserName);
        searchUI.add(lblExperienceRange);
        searchUI.add(cmbExperience);
        searchUI.add(lblSkill);
        searchUI.add(txtSkill);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblUserName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblExperienceRange, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblSkill, gbc);
    }

    @Override
    public void initialize() {
        txtUserName.setText("Enter UserName Here");
        txtSkill.setText("Internet Tech");
    }

    @Override
    public String getSQL() {
        String experience =
                (String) cmbExperience.getSelectedItem();
        return ("Select * from Candidate where Username='" +
                txtUserName.getText() + "' and Experience " +
                experience + " and Skill='" +
                txtSkill.getText() + "'");
    }
}
