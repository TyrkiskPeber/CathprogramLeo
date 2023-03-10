package Client;

import javax.swing.*;

public class C_View {
    private JButton sendButton;
    private JEditorPane chatFieldEditorPane;
    private JFormattedTextField enterMessageField;
    private JButton logOutButton;
    private JPanel viewPanel;

    public C_View() {

    }

    public JPanel getViewPanel() {
        return viewPanel;
    }

    public JButton getSendButton() {
        return sendButton;
    }

    public JEditorPane getChatField() {
        return chatFieldEditorPane;
    }

    public JFormattedTextField getMsgField() {
        return enterMessageField;
    }

    public JButton getLogOutButton() {
        return logOutButton;
    }
}
