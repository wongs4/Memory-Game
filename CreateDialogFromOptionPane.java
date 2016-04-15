import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CreateDialogFromOptionPane {

    public static void main(final String[] args) {
        final JFrame parent = new JFrame();
        JButton button = new JButton();

        button.setText("Click me to show dialog!");
        parent.add(button);
        parent.pack();
        parent.setVisible(true);

        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               Object[] options = { “Yes”,
                            “No”};

int n =JOptionPane.showOptionDialog(null,
            “\n”
            + “Is today Monday?”
            + “\n\n”,
            “Please Confirm”,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);

       // YES OPTION CLICKED
       if(n == 0){
           System.out.println(“YES Clicked”);
       }

       // NO OPTION CLICKED
       if(n == 1){
           System.out.println(“NO Clicked”);
       }

       // CROSS CLICKED
       if(n == -1){
           System.out.println(“Cross Clicked”);
       }
            }
        });
    }
}