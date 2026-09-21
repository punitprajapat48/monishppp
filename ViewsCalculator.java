import javax.swing.*;

public class ViewsCalculator extends JFrame {

    JLabel a, b, result;
    JTextField txt, txtb, txtresult;
    JButton add, sub, mul, div;

    public ViewsCalculator() {

        setTitle("Calculator");
        setSize(550, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Value A
        a = new JLabel("Enter A");
        a.setBounds(30, 30, 150, 25);
        add(a);

        txt = new JTextField();
        txt.setBounds(200, 30, 150, 25);
        add(txt);

        // Value B
        b = new JLabel("Enter B");
        b.setBounds(30, 80, 150, 25);
        add(b);

        txtb = new JTextField();
        txtb.setBounds(200, 80, 150, 25);
        add(txtb);

        // Result
        result = new JLabel("Result");
        result.setBounds(30, 130, 150, 25);
        add(result);

        txtresult = new JTextField();
        txtresult.setBounds(200, 130, 150, 25);
        txtresult.setEditable(x: false);
        add(txtresult);

        // Buttons
        add = new JButton("+");
        add.setBounds(30, 180, 100, 30);
        add.addAncestorListener(add);
        add(add);

        sub = new JButton("-");
        sub.setBounds(150, 180, 100, 30);
        sub.addActionListener(sub);
        add(sub);

        mul = new JButton("*");
        mul.setBounds(270, 180, 100, 30);
        mul.addActionListener(mul);
        add(mul);

        div = new JButton("/");
        div.setBounds(390, 180, 100, 30);
        div.addActionListener(div);

        add(div);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewsCalculator();
    }
}