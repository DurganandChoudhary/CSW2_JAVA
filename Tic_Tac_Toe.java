import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;
public class Tic_Tac_Toe {
    private JFrame frmTictactoe;
    private JFrame frame;
    private String startGame="X";
    private int xcount=0;
    private int ocount=0;
    private JTextField xscore;
    private JTextField oscore;
    private int b1=32;
    private int b2=32;
    private int b3=32;
    private int b4=32;
    private int b5=32;
    private int b6=32;
    private int b7=32;
    private int b8=32;
    private int b9=32;
    private int k;
    private String s;
    JButton but1 = new JButton("");
    JButton but2 = new JButton("");
    JButton but3 = new JButton("");
    JButton but4 = new JButton("");
    JButton but5 = new JButton("");
    JButton but6 = new JButton("");
    JButton but7 = new JButton("");
    JButton but8 = new JButton("");
    JButton but9 = new JButton("");
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tic_Tac_Toe window = new Tic_Tac_Toe();
                    window.frmTictactoe.setVisible(true);
                    window.frmTictactoe.setLocationRelativeTo(null);
                    window.frmTictactoe.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Tic_Tac_Toe() {
        initialize();
    }
    private void choosePlayer() {
        if(startGame.equalsIgnoreCase("X")) {
            startGame="O";
        }
        else {
            startGame="X";
        }
    }
    private void disable() {
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);
    }
    private void x_score_board(int k) {
        if(k<10) {
            s="0"+String.valueOf(xcount);
            xscore.setText(s);
        }
        else {
            xscore.setText(String.valueOf(xcount));
        }
    }
    private void o_score_board(int k) {
        if(k<10) {
            s="0"+String.valueOf(ocount);
            oscore.setText(s);
        }
        else {
            oscore.setText(String.valueOf(ocount));
        }
    }
    private void GameWin() {
        if(b1==1 && b2==1 && b3==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but1.setBackground(Color.GREEN);
            but2.setBackground(Color.GREEN);
            but3.setBackground(Color.GREEN);
            disable();
        }
        else if(b4==1 && b5==1 && b6==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but4.setBackground(Color.GREEN);
            but5.setBackground(Color.GREEN);
            but6.setBackground(Color.GREEN);
            disable();
        }
        else if(b7==1 && b8==1 && b9==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but7.setBackground(Color.GREEN);
            but8.setBackground(Color.GREEN);
            but9.setBackground(Color.GREEN);
            disable();
        }
        else if(b1==1 && b4==1 && b7==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but1.setBackground(Color.GREEN);
            but4.setBackground(Color.GREEN);
            but7.setBackground(Color.GREEN);
            disable();
        }
        else if(b2==1 && b5==1 && b8==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but2.setBackground(Color.GREEN);
            but5.setBackground(Color.GREEN);
            but8.setBackground(Color.GREEN);
            disable();
        }
        else if(b3==1 && b6==1 && b9==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but3.setBackground(Color.GREEN);
            but6.setBackground(Color.GREEN);
            but9.setBackground(Color.GREEN);
            disable();
        }
        else if(b1==1 && b5==1 && b9==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but1.setBackground(Color.GREEN);
            but5.setBackground(Color.GREEN);
            but9.setBackground(Color.GREEN);
            disable();
        }
        else if(b3==1 && b5==1 && b7==1) {
            JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            x_score_board(xcount);
            but3.setBackground(Color.GREEN);
            but5.setBackground(Color.GREEN);
            but7.setBackground(Color.GREEN);
            disable();
        }
        else if(b1==0 && b2==0 && b3==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but1.setBackground(Color.RED);
            but2.setBackground(Color.RED);
            but3.setBackground(Color.RED);
            disable();
        }
        else if(b4==0 && b5==0 && b6==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but4.setBackground(Color.RED);
            but5.setBackground(Color.RED);
            but6.setBackground(Color.RED);
            disable();
        }
        else if(b7==0 && b8==0 && b9==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but7.setBackground(Color.RED);
            but8.setBackground(Color.RED);
            but9.setBackground(Color.RED);
            disable();
        }
        else if(b1==0 && b4==0 && b7==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but1.setBackground(Color.RED);
            but4.setBackground(Color.RED);
            but7.setBackground(Color.RED);
            disable();
        }
        else if(b2==0 && b5==0 && b8==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but2.setBackground(Color.RED);
            but5.setBackground(Color.RED);
            but8.setBackground(Color.RED);
            disable();
        }
        else if(b3==0 && b6==0 && b9==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but3.setBackground(Color.RED);
            but6.setBackground(Color.RED);
            but9.setBackground(Color.RED);
            disable();
        }
        else if(b1==0 && b5==0 && b9==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but1.setBackground(Color.RED);
            but5.setBackground(Color.RED);
            but9.setBackground(Color.RED);
            disable();
        }
        else if(b3==0 && b5==0 && b7==0) {
            JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            o_score_board(ocount);
            but3.setBackground(Color.RED);
            but5.setBackground(Color.RED);
            but7.setBackground(Color.RED);
            disable();
        }
        else if(but1.getText()!="" && but2.getText()!="" && but3.getText()!="" && but4.getText()!="" && but5.getText()!="" && but6.getText()!="" && but7.getText()!="" && but8.getText()!="" && but9.getText()!=""){
            JOptionPane.showMessageDialog(frame,"WELL PLAYED!\nMATCH TIED","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            disable();
        }
    }
    private void initialize() {
        but1.setBackground(Color.WHITE);
        but1.setText("");
        but2.setBackground(Color.WHITE);
        but2.setText("");
        but3.setBackground(Color.WHITE);
        but3.setText("");
        but4.setBackground(Color.WHITE);
        but4.setText("");
        but5.setBackground(Color.WHITE);
        but5.setText("");
        but6.setBackground(Color.WHITE);
        but6.setText("");
        but7.setBackground(Color.WHITE);
        but7.setText("");
        but8.setBackground(Color.WHITE);
        but8.setText("");
        but9.setBackground(Color.WHITE);
        but9.setText("");
        frmTictactoe = new JFrame();
        frmTictactoe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sudheer\\Desktop\\LetsGrowMore\\JAVA DEVELOPMENT\\TIC_TAC_TOE\\image1"));
        frmTictactoe.setTitle("TIC-TAC-TOE");
        frmTictactoe.setBounds(100, 100, 889, 653);
        frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTictactoe.getContentPane().setLayout(null);
        but1.setFont(new Font("Arial Black", Font.BOLD, 56));
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but1.getText()==""){
                    but1.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but1.setForeground(Color.BLUE);
                        b1=1;
                    }
                    else {
                        but1.setForeground(Color.RED);
                        b1=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but1.setBounds(29, 104, 149, 115);
        frmTictactoe.getContentPane().add(but1);
        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but2.getText()==""){
                    but2.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but2.setForeground(Color.BLUE);
                        b2=1;
                    }
                    else {
                        but2.setForeground(Color.RED);
                        b2=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but2.setFont(new Font("Arial Black", Font.BOLD, 56));
        but2.setBounds(202, 104, 149, 115);
        frmTictactoe.getContentPane().add(but2);
        but3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but3.getText()==""){
                    but3.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but3.setForeground(Color.BLUE);
                        b3=1;
                    }
                    else {
                        but3.setForeground(Color.RED);
                        b3=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but3.setFont(new Font("Arial Black", Font.BOLD, 56));
        but3.setBounds(374, 104, 149, 115);
        frmTictactoe.getContentPane().add(but3);
        but4.setFont(new Font("Arial Black", Font.BOLD, 56));
        but4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but4.getText()==""){
                    but4.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but4.setForeground(Color.BLUE);
                        b4=1;
                    }
                    else {
                        but4.setForeground(Color.RED);
                        b4=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but4.setBounds(29, 230, 149, 115);
        frmTictactoe.getContentPane().add(but4);
        but5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but5.getText()==""){
                    but5.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but5.setForeground(Color.BLUE);
                        b5=1;
                    }
                    else {
                        but5.setForeground(Color.RED);
                        b5=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but5.setFont(new Font("Arial Black", Font.BOLD, 56));
        but5.setBounds(202, 230, 149, 115);
        frmTictactoe.getContentPane().add(but5);
        but6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but6.getText()==""){
                    but6.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but6.setForeground(Color.BLUE);
                        b6=1;
                    }
                    else {
                        but6.setForeground(Color.RED);
                        b6=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but6.setFont(new Font("Arial Black", Font.BOLD, 56));
        but6.setBounds(374, 230, 149, 115);
        frmTictactoe.getContentPane().add(but6);
        but7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but7.getText()==""){
                    but7.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but7.setForeground(Color.BLUE);
                        b7=1;
                    }
                    else {
                        but7.setForeground(Color.RED);
                        b7=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but7.setFont(new Font("Arial Black", Font.BOLD, 56));
        but7.setBounds(29, 356, 149, 115);
        frmTictactoe.getContentPane().add(but7);
        but8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but8.getText()==""){
                    but8.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but8.setForeground(Color.BLUE);
                        b8=1;
                    }
                    else {
                        but8.setForeground(Color.RED);
                        b8=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but8.setFont(new Font("Arial Black", Font.BOLD, 56));
        but8.setBounds(202, 356, 149, 115);
        frmTictactoe.getContentPane().add(but8);
        but9.setFont(new Font("Arial Black", Font.BOLD, 56));
        but9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(but9.getText()==""){
                    but9.setText(startGame);
                    if(startGame.equalsIgnoreCase("X")) {
                        but9.setForeground(Color.BLUE);
                        b9=1;
                    }
                    else {
                        but9.setForeground(Color.RED);
                        b9=0;
                    }
                    choosePlayer();
                    GameWin();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "This box was already taken.\nPlease Select the empty box.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but9.setBounds(374, 356, 149, 115);
        frmTictactoe.getContentPane().add(but9);
        JButton reset = new JButton("RESET");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                but1.setBackground(Color.WHITE);
                but2.setBackground(Color.WHITE);
                but3.setBackground(Color.WHITE);
                but4.setBackground(Color.WHITE);
                but5.setBackground(Color.WHITE);
                but6.setBackground(Color.WHITE);
                but7.setBackground(Color.WHITE);
                but8.setBackground(Color.WHITE);
                but9.setBackground(Color.WHITE);
                but1.setEnabled(true);
                but2.setEnabled(true);
                but3.setEnabled(true);
                but4.setEnabled(true);
                but5.setEnabled(true);
                but6.setEnabled(true);
                but7.setEnabled(true);
                but8.setEnabled(true);
                but9.setEnabled(true);
                but1.setText("");
                but2.setText("");
                but3.setText("");
                but4.setText("");
                but5.setText("");
                but6.setText("");
                but7.setText("");
                but8.setText("");
                but9.setText("");
                b1=b2=b3=b4=b5=b6=b7=b8=b9=32;
            }
        });
        reset.setBackground(new Color(0, 0, 255));
        reset.setFont(new Font("Arial Black", Font.BOLD, 32));
        reset.setForeground(new Color(245, 255, 250));
        reset.setBounds(29, 495, 211, 88);
        frmTictactoe.getContentPane().add(reset);
        JButton exit = new JButton("EXIT");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame,"Do you want to Quit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
            }
        });
        exit.setBackground(new Color(220, 20, 60));
        exit.setFont(new Font("Arial Black", Font.BOLD, 32));
        exit.setForeground(new Color(245, 255, 250));
        exit.setBounds(292, 495, 231, 88);
        frmTictactoe.getContentPane().add(exit);
        JLabel lblNewLabel_1 = new JLabel("SCORE BOARD");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 26));
        lblNewLabel_1.setBackground(new Color(175, 238, 238));
        lblNewLabel_1.setBounds(554, 104, 311, 115);
        frmTictactoe.getContentPane().add(lblNewLabel_1);
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 255, 255));
        panel_1.setBounds(554, 104, 311, 115);
        frmTictactoe.getContentPane().add(panel_1);
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(175, 238, 238));
        panel_2.setBounds(602, 230, 211, 54);
        frmTictactoe.getContentPane().add(panel_2);
        JLabel lblNewLabel_2 = new JLabel("PLAYER-X");
        panel_2.add(lblNewLabel_2);
        lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 30));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBackground(new Color(175, 238, 238));
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(new Color(175, 238, 238));
        panel_2_1.setBounds(602, 417, 211, 54);
        frmTictactoe.getContentPane().add(panel_2_1);
        JLabel lblNewLabel_2_1 = new JLabel("PLAYER-O");
        panel_2_1.add(lblNewLabel_2_1);
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 30));
        lblNewLabel_2_1.setBackground(new Color(175, 238, 238));
        xscore = new JTextField();
        xscore.setBackground(new Color(175, 238, 238));
        xscore.setFont(new Font("Arial Black", Font.BOLD, 50));
        xscore.setHorizontalAlignment(SwingConstants.CENTER);
        xscore.setForeground(new Color(0, 0, 205));
        xscore.setText("00");
        xscore.setEditable(false);
        xscore.setBounds(637, 297, 149, 93);
        frmTictactoe.getContentPane().add(xscore);
        xscore.setColumns(10);
        oscore = new JTextField();
        oscore.setBackground(new Color(175, 238, 238));
        oscore.setFont(new Font("Arial Black", Font.BOLD, 50));
        oscore.setText("00");
        oscore.setEditable(false);
        oscore.setHorizontalAlignment(SwingConstants.CENTER);
        oscore.setForeground(new Color(220, 20, 60));
        oscore.setColumns(10);
        oscore.setBounds(637, 490, 149, 93);
        frmTictactoe.getContentPane().add(oscore);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(186, 85, 211));
        panel.setBounds(0, 0, 875, 93);
        frmTictactoe.getContentPane().add(panel);
        JLabel lblNewLabel = new JLabel("TIC-TAC-TOE");
        panel.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(245, 255, 250));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 52));
    }
}