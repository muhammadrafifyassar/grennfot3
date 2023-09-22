import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kepik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kepik extends Actor
{
    /**
     * Act - do whatever the kepik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int JumlahApelDimakan = 0;
    public void act()
    {
        // Add your action code here.
        move(1);
        if(Greenfoot.isKeyDown("left")){
             turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
             turn(5);
        }
        MakanApel();
        cekScore();
        getWorld().showText("Score : "+JumlahApelDimakan,100,50);
    }
    public void MakanApel(){
        Actor apel = getOneObjectAtOffset(0,0, Apel.class);
        if(apel != null){
            getWorld().removeObject(apel);
            JumlahApelDimakan++;
        }
    }
    public void cekScore(){
        if(JumlahApelDimakan > 2){
        finish alret_finish = new finish();
        getWorld().addObject(alret_finish,300,300);
        }
    }
}