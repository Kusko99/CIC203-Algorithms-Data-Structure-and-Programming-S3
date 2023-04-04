public class GameEntry{
    protected String name;  //nome da pessoa que obteve o score
    protected int score;    //valor do escore
    /**Construtor que cria um registro do jogo */
    public GameEntry(String n, int s){
        name = n;
        score = s;
    }
    /**Recupera o campo nome */
    public String getName(){
        return name;
    }
    /**Recupera o campo escore */
    public int getScore(){
        return score;
    }
    /**Retorna uma string com a representação deste registro */
    public String toString(){
        return "(" + name + ", " + score + ")";
    }
}
