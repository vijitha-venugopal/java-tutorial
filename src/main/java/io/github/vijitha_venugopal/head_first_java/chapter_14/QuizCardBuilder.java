package io.github.vijitha_venugopal.head_first_java.chapter_14;


import  java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by vijitha on 09/08/16.
 */
public class QuizCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;
    private JPanel mainpanel;
    private JButton nextButton;
    
    public static void main(String[] args) {
        QuizCardBuilder builder=new QuizCardBuilder();
        builder.go();
    }

    public void go(){
        frame=new JFrame("Quiz Card Builder");
        mainpanel=new JPanel();
        Font bigFont=new Font("sanserif",Font.BOLD,24);
        
        question=new JTextArea(6,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);
        
        JScrollPane qScroller=new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        answer=new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller=new JScrollPane(answer);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
         nextButton=new JButton("Next Card");
        
        cardList=new ArrayList<QuizCard>();
        
        JLabel qLabel=new JLabel("Question :");
        JLabel aLabel=new JLabel("Answer :");
        
        mainpanel.add(qLabel);
        mainpanel.add(qScroller);
        mainpanel.add(aLabel);
        mainpanel.add(aScroller);
        mainpanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        
        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem newMenuItem=new JMenuItem("New");
        newMenuItem.addActionListener(new NewmenuListener());
        JMenuItem saveMenuItem= new JMenuItem("Save");
        saveMenuItem.addActionListener(new SaveMenuListener());
        
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
        frame.setSize(500,600);
        frame.setVisible(true);


    }
    private class NextCardListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            QuizCard card=new QuizCard(question.getText(),answer.getText());
            cardList.add(card);
            clearCard();
        }
    }
    private class SaveMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            QuizCard card=new QuizCard(question.getText(),answer.getText());
            cardList.add(card);
            JFileChooser filesave=new JFileChooser();
            filesave.showSaveDialog(frame);
            saveFile(filesave.getSelectedFile());
        }
    }
    private class NewmenuListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            cardList.clear();
            clearCard();
        }
    }
    private void clearCard(){
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
    private void saveFile(File file){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (QuizCard card:cardList){
                writer.write(card.getQuestion()+"/");
                writer.write(card.getAnswer()+"\n");
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Could,'t write the cardList out");
            e.printStackTrace();
        }
    }

}
