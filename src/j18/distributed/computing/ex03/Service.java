package j18.distributed.computing.ex03;
import javax.swing.*;
import java.io.*;

public interface Service extends Serializable { 
    public JPanel getGuiPanel();
}