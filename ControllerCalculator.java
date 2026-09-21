import java.awt.event.ActionEvent;

import javax.swing.*;

public class ControllerCalculator implements ActionListener{
ModelCalculator mc = new ModelCalculator();
ViewsCalculator vc = new ViewsCalculator();

ControllerCalculator(ModelCalculator mc, ViewsCalculator vc){
    this.mc = mc;

    vc.btnadd.addActionListener(this);
    vc.btnsub.addActionListener(this);
    vc.btnmul.addActionListener(this);
    vc.btndiv.addActionListener(this);
    @Override
    public void actionPerformed(ActionEvent e){

        int a = Double.parseDouble(vc.txta.getText());
        int b = Double.parseDouble(vc.txtb.getText());


        if(e.getSource().equals(vc.btnadd)){
            vc.txtresult.setText(String.valueOf(mc.add(a, b)));
        }
        else if(e.getSource().equals(vc.btnsub)){
            vc.txtresult.setText(String.valueOf(mc.sub(a, b)));
        }
        else if(e.getSource().equals(vc.btnmul)){
            vc.txtresult.setText(String.valueOf(mc.mul(a, b)));
        }
        else if(e.getSource().equals(vc.btndiv)){
            vc.txtresult.setText(String.valueOf(mc.div(a, b)));
        }

    }
    

}