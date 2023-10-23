package Model;

import java.io.Serializable;
public class Operation implements Serializable{
    private int nb1 ;
    private int nb2 ;
    private char op ;
    private int res ;

    public Operation (int nb1 , int nb2 , char op){
        this.nb1 = nb1 ;
        this.nb2 = nb2 ;
        while ((op=='+')||(op=='-')||(op=='*')||(op=='/')){
            this.op=op;
        }
    }

    public int getNb1() {
        return nb1;
    }

    public int getNb2() {
        return nb2;
    }

    public char getOp() {
        return op;
    }

    public int getRes() {
        return res;
    }

    public void setNb1(int res) {
        this.res = res;
    }

    public void setNb2(int nb2) {
        this.nb2 = nb2;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
