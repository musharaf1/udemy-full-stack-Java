/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

/**
 *
 * @author musharaf
 */
public class Team {

     Member member;
     Arithmetic arithmetic;
     public Team(Arithmetic arithmetic){
     this.arithmetic = arithmetic;
     }
     
    public Team(Member member){
        this.member = member;
    }
    

    public static void main(String[] args) {
    Member newMember = new Member("auriel","light",5,7);
    Team myTeam = new Team(newMember);
    Arithmetic variables = new Arithmetic(2,3,4,5);
    Team addUp = new Team(variables);
    
//        System.out.println(myTeam.member.getLevel());
//        System.out.println(myTeam.member.getType());
//        System.out.println(myTeam.member.getName());
//        System.out.println(myTeam.member.getRank());
//        
char heart = '\u2764';
        System.out.println(Character.toString(heart));
        
        System.out.println(addUp.arithmetic.addition());
    
    }

}
class Member{
    private String name;
    private String type;
    private int level;
    private int rank;
    
    public Member(String name,String type,int level,int rank){
    this.name = name;
    this.level = level;
    this.rank = rank;
    this.type = type;
    }
    
    public String getName(){
    return this.name;
    }
     public String getType(){
    return this.type;
    }
      public int getLevel(){
    return this.level;
    }
       public int getRank(){
    return this.rank;
    }
}

class Arithmetic{
private int w;
private int x;
private int y;
private int z;

    public Arithmetic(int w, int x, int y,int z){
    this.w = w;
    this.x = x;
    this.y = y;
    this.z = z;
    
    }

    /**
     * @return the w
     */
    public int getW() {
        return w;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }
    int addition(){

return w+x+y+z;
        }

}