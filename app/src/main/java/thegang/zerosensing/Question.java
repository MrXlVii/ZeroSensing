package thegang.zerosensing;

import java.util.ArrayList;

/**
 * Created by Tasheme Thomas on 1/30/17.
 */
//updates associated types based on answer choice
public class Question {

    private ArrayList<Type> types = new ArrayList<>();
    private String question = "";
    private String optA = "";
    private String optB = "";
    private String optC = "";
    private String optD = "";
    private int ID;

    public Question(ArrayList<Type> types, String question, String optA, String optB, String optC, String optD){
        this.types = types;
        this.question = question;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.optD = optD;
    }

    public void addType(Type value){
        //updates associated types based on answer choice
        types.add(value);
    }
}
