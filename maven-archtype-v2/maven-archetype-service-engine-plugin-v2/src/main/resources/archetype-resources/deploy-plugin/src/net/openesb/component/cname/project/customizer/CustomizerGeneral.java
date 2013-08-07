/*
 * CustomizerGeneral.java
 */
package net.openesb.component.${artifactId}.project.customizer;

import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.openide.util.HelpCtx;

/**
 *
 * @author chikkala
 */
public class CustomizerGeneral extends JPanel implements HelpCtx.Provider {
    
    private SEPluginProjectCustomizerModel uiModel;
    
    public CustomizerGeneral(SEPluginProjectCustomizerModel uiModel) {
        
        this.uiModel = uiModel;
        
        initComponents();
        
        initTargetComponent(uiModel.getSUTargetModel());
        
        this.mSUNameTF.setDocument(uiModel.getSUNameModel());
        this.mSUDescriptionTA.setDocument(uiModel.getSUDescriptionModel());        
        
    }
    
    public HelpCtx getHelpCtx() {
        return new HelpCtx(CustomizerGeneral.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mSUTargetLBL = new javax.swing.JLabel();
        mSUTargetValueLBL = new javax.swing.JLabel();
        mSUNameLBL = new javax.swing.JLabel();
        mSUNameTF = new javax.swing.JTextField();
        mSUDescriptionLBL = new javax.swing.JLabel();
        mSUDescriptionScrollPane = new javax.swing.JScrollPane();
        mSUDescriptionTA = new javax.swing.JTextArea();
        mFillLBL = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        mSUTargetLBL.setLabelFor(mSUTargetValueLBL);
        mSUTargetLBL.setText(org.openide.util.NbBundle.getMessage(CustomizerGeneral.class, "LBL_config.general.su.target")); // NOI18N
        mSUTargetLBL.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 2, 2, 4);
        add(mSUTargetLBL, gridBagConstraints);
        mSUTargetLBL.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(CustomizerGeneral.class, "LBL_config.general.su.target")); // NOI18N

        mSUTargetValueLBL.setText(org.openide.util.NbBundle.getMessage(CustomizerGeneral.class, "LBL_config.general.su.target.value.unknown")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 2, 2, 4);
        add(mSUTargetValueLBL, gridBagConstraints);
        mSUTargetValueLBL.getAccessibleContext().setAccessibleName("");

        mSUNameLBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mSUNameLBL.setLabelFor(mSUNameTF);
        mSUNameLBL.setText(org.openide.util.NbBundle.getMessage(CustomizerGeneral.class, "LBL_config.general.su.name")); // NOI18N
        mSUNameLBL.setToolTipText("");
        mSUNameLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 4);
        add(mSUNameLBL, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 4);
        add(mSUNameTF, gridBagConstraints);

        mSUDescriptionLBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mSUDescriptionLBL.setText(org.openide.util.NbBundle.getMessage(CustomizerGeneral.class, "LBL_config.general.su.desc")); // NOI18N
        mSUDescriptionLBL.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 4);
        add(mSUDescriptionLBL, gridBagConstraints);

        mSUDescriptionScrollPane.setPreferredSize(new java.awt.Dimension(4, 40));

        mSUDescriptionTA.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        mSUDescriptionTA.setMargin(new java.awt.Insets(1, 1, 1, 1));
        mSUDescriptionScrollPane.setViewportView(mSUDescriptionTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 4);
        add(mSUDescriptionScrollPane, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        add(mFillLBL, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mFillLBL;
    private javax.swing.JLabel mSUDescriptionLBL;
    private javax.swing.JScrollPane mSUDescriptionScrollPane;
    private javax.swing.JTextArea mSUDescriptionTA;
    private javax.swing.JLabel mSUNameLBL;
    private javax.swing.JTextField mSUNameTF;
    private javax.swing.JLabel mSUTargetLBL;
    private javax.swing.JLabel mSUTargetValueLBL;
    // End of variables declaration//GEN-END:variables
    
    private void setDocumentText(Document doc, String text) {
        try {
            doc.remove(0, doc.getLength());
            doc.insertString(0, text, null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
            // ingore
        }
    }
    
    private String getDocumentText(Document doc) {
        try {
            return doc.getText(0, doc.getLength());
        } catch (BadLocationException ex) {
            ex.printStackTrace();
            return "";
        }
    }
    
    private void initTargetComponent(Document doc) {
        String targetComp = getDocumentText(doc);
        this.mSUTargetValueLBL.setText(targetComp);
    }
}
