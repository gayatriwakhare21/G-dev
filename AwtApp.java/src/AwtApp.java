import java.awt.*;

class AwtApp extends Frame {
    AwtApp() {
        Label firstName = new Label("First name");
        firstName.setBounds(20, 50, 80, 20);
        
        Label lastName = new Label("Last name");
        lastName.setBounds(20, 80, 80, 20);
        
        Label dob = new Label("Date of Birth");
        dob.setBounds(20, 110, 80, 20);
        
        Label address = new Label("Address");
        address.setBounds(20, 140, 80, 20);
        
        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 150, 20);
        
        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 150, 20);
        
        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 150, 20);
        
        TextArea addressTA = new TextArea();
        addressTA.setBounds(120, 140, 150, 100);
        
        Button submit = new Button("Submit");
        submit.setBounds(20, 250, 100, 30);
        
        Button reset = new Button("Reset");
        reset.setBounds(120, 250, 100, 30);
        
        add(firstName);
        add(lastName);
        add(dob);
        add(address);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(submit);
        add(reset);
        add(addressTA);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtApp awt = new AwtApp();
    }
}



