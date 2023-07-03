
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HoPeLaD
 */
class Person {

    private String name, gender, email, number;

    public Person(String name, String gender, String email, String number) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

public class CRUDApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To create JFrame that holds the others component
        JFrame f = new JFrame();
        f.setSize(500, 600);
        f.setTitle("CRUD Application");
        //TO create A place accept the input form the user for name.
        JLabel lb = new JLabel("Name");
        lb.setBounds(30, 100, 180, 30);
        Font fnt = lb.getFont();
        fnt = fnt.deriveFont(14f);
        lb.setFont(fnt);
        f.add(lb);

        JTextField inpt = new JTextField();
        inpt.setBounds(130, 105, 180, 25);
        inpt.setVisible(true);
        inpt.setBackground(Color.decode("#a5e5e8"));
        f.add(inpt);

        //TO create A place accept the input form the user for gender.
        JLabel lb2 = new JLabel("Gender");
        lb2.setBounds(30, 130, 180, 30);
        Font fnt1 = lb2.getFont();
        fnt1 = fnt1.deriveFont(14f);
        lb2.setFont(fnt1);
        f.add(lb2);

        String[] options = {" ", " Male", " Female",};

        // Create a JComboBox with the options
        JComboBox<String> fromdropdown = new JComboBox<>(options);
        fromdropdown.setBounds(130, 135, 180, 25);
        fromdropdown.setBackground(Color.decode("#a5e5e8"));
        f.add(fromdropdown);

//TO create A place accept the input form the user for phone number.
        JLabel lb3 = new JLabel("P.Number");
        lb3.setBounds(30, 160, 180, 30);
        Font fnt2 = lb3.getFont();
        fnt2 = fnt2.deriveFont(14f);
        lb3.setFont(fnt2);
        f.add(lb3);

        JTextField inpt2 = new JTextField();
        inpt2.setBounds(130, 165, 180, 25);
        inpt2.setVisible(true);
        inpt2.setBackground(Color.decode("#a5e5e8"));
        f.add(inpt2);

        //TO create A place accept the input form the user for email.
        JLabel lb4 = new JLabel("Email");
        lb4.setBounds(30, 190, 180, 30);
        Font fnt3 = lb4.getFont();
        fnt3 = fnt3.deriveFont(14f);
        lb4.setFont(fnt3);
        f.add(lb4);

        JTextField inpt3 = new JTextField();
        inpt3.setBounds(130, 195, 180, 25);
        inpt3.setVisible(true);
        inpt3.setBackground(Color.decode("#a5e5e8"));
        f.add(inpt3);
        //For J table that shows the TOPIC of this tool.
        JLabel l = new JLabel("CRUD  TOOL");
        l.setBackground(Color.red);
        l.setBounds(160, 10, 380, 100);
        Font font = l.getFont();
        font = font.deriveFont(24f);
        l.setFont(font);
        f.add(l);

        // to add button Add
        JButton Create = new JButton("Create");
        Create.setBounds(50, 240, 80, 30);
        Create.getFont();
        Create.setForeground(Color.black);
        Create.setBackground(Color.decode("#60e677"));
        f.add(Create);

        // to add button Edit
        JButton View = new JButton("View");
        View.setBounds(140, 240, 70, 30);
        View.getFont();
        View.setForeground(Color.black);
        View.setBackground(Color.decode("#60e677"));
        f.add(View);

        // to add button Update
        JButton Update = new JButton("Update");
        Update.setBounds(210, 240, 80, 30);
        Update.getFont();
        Update.setForeground(Color.black);
        Update.setBackground(Color.decode("#60e677"));
        f.add(Update);

        // to add button Delete
        JButton Delete = new JButton("Delete");
        Delete.setBounds(300, 240, 80, 30);
        Delete.getFont();
        Delete.setForeground(Color.black);
        Delete.setBackground(Color.decode("#60e677"));
        f.add(Delete);

        // To give output
        JTextArea otpt = new JTextArea();
        otpt.setBounds(15, 290, 450, 100);
        otpt.getFont();
        otpt.setForeground(Color.black);
        otpt.setBackground(Color.decode("#f0ebdf"));
        otpt.setEditable(false);
        f.add(otpt);
        //For search input And Find Button
        JTextField search = new JTextField();
        search.setBounds(200, 410, 80, 20);
        search.setBackground(Color.decode("#a5e5e8"));
        f.add(search);

        JButton find = new JButton("Find");
        find.setBounds(290, 410, 60, 20);
        find.getFont();
        find.setForeground(Color.black);
        find.setBackground(Color.decode("#60e677"));
        f.add(find);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(true);
        f.setLocationRelativeTo(null);

        ArrayList<Person> people = new ArrayList<>();

        Create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inpt.getText().length() <= 0 || inpt2.getText().length() <= 0 || inpt3.getText().length() <= 0) {
                    JOptionPane.showMessageDialog(null, "Empty Field!");
                } else {
                    try {
                        String name = inpt.getText();
                        String gender = (String) fromdropdown.getSelectedItem();
                        String email = inpt2.getText();
                        String number = inpt3.getText();
                        Person person = new Person(name, gender, email, number);
                        people.add(person);
                        JOptionPane.showMessageDialog(null, "Successefully Created");

                        inpt.setText("");
                        fromdropdown.setSelectedItem(false);
                        inpt2.setText("");
                        inpt3.setText("");

                    } catch (NumberFormatException ex) {
                        otpt.setText("       Error !");
                        otpt.setBackground(red);
                        return;

                    }
                }
            }
        });

        View.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (people.isEmpty()) {
                        otpt.setText("No people in the list.");
                    } else {
                        otpt.setText("People List:");
                        StringBuilder stringBuilder = new StringBuilder();
                        for (int i = 0; i < people.size(); i++) {
                            Person person = people.get(i);
                            String personInfo = "Index: " + i + " " + " Name_: " + person.getName() + " _Gender_: " + person.getGender() + "_ Email_: " + person.getEmail() + " _Ph.Number:_ " + person.getNumber();
                            stringBuilder.append(personInfo).append("\n");
                        }
                        String allData = stringBuilder.toString();
                        otpt.setText(allData);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Hmmm", "Error", JOptionPane.ERROR_MESSAGE);
                    otpt.setText("       Error !");
                    otpt.setBackground(red);
                    return;
                }
            }
        });

        Update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (people.isEmpty()) {
                        otpt.setText("No people in the list.");
                    } else {

                        String input = search.getText();
                        int index = Integer.parseInt(input);
                        if (index < 0 || index >= people.size()) {
                            otpt.setText("Invalid index. Please try again.");
                        } else {
                            Person person = people.get(index);
                            String newName = inpt.getText();
                            String newGender = (String) fromdropdown.getSelectedItem();
                            String newEmail = inpt2.getText();
                            String newNumber = inpt3.getText();
                            person = new Person(newName, newGender, newEmail, newNumber);
                            people.set(index, person);

                            JOptionPane.showMessageDialog(null, "Successfully Updated");
                        }
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (people.isEmpty()) {
                        otpt.setText("No people in the list.");
                    } else {

                        String input = search.getText();
                        int index = Integer.parseInt(input);
                        if (index < 0 || index >= people.size()) {
                            otpt.setText("Invalid index. Please try again.");
                        } else {
                            Person person = people.get(index);
                            inpt.setText(person.getName());
                            fromdropdown.setSelectedItem(person.getGender());
                            inpt2.setText(person.getEmail());
                            inpt3.setText(person.getNumber());

                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i = 0; i < people.size(); i++) {

                                String personInfo ="  REQUIRED INFORMATION : "+ "\n Index: " + i + " " + "\n Name_: " + person.getName() + "\n Gender_: " + person.getGender() + "\n Email_: " + person.getEmail() + "\n Ph.Number:_ " + person.getNumber();
                                stringBuilder.append(personInfo).append("\n");
                            }
                            String allData = stringBuilder.toString();
                            otpt.setText(allData);
                            people.set(index, person);

                        }
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (people.isEmpty()) {
                        otpt.setText("No people in the list.");
                    } else {
                        String input = search.getText();
                        int index = Integer.parseInt(input);
                        if (index < 0 || index >= people.size()) {
                            otpt.setText("Invalid index. Please try again.");
                        } else {
                            Person person = people.remove(index);
                            JOptionPane.showMessageDialog(null, "Successfully Deleted : " + person.getName());
                        }
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

    }
}
