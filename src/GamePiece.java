public class GamePiece {
    private Integer positionX;
    private Integer positionY;
    private Boolean frozen;

    private String name;
    private String color;

    public GamePiece(String name, String color){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    public Integer getPositionX() {
        return positionX;
    }
    public Integer getPositionY() {
        return positionY;
    }
    public Boolean getFrozen() {
        return frozen;
    }

    public void move(Integer leftRightMove, Integer upDownMove) {
        if (frozen == true) {
            System.out.println(this.name + " is frozen, therefore they cannot move.");
            return;
        } else {
            //moving position left or right
            positionX += leftRightMove;
            if (leftRightMove > 0) {
                System.out.println(this.name + " moved to the left " + leftRightMove + " spaces.");
            } else {
                System.out.println(this.name + " moved to the right " + leftRightMove + " spaces.");
            }

            //moving position up or down
            positionY += upDownMove;

            if (upDownMove > 0) {
                System.out.println(this.name + " moved to forward " + upDownMove + " spaces.");
            } else {
                System.out.println(this.name + " moved to backward " + upDownMove + " spaces.");
            }
        }
    }
    public void freeze(){
        frozen = true;
        System.out.println(this.name + " is now frozen and can no longer move.");
    }
    public void unfreeze(){
        frozen = false;
        System.out.println(this.name + " is now unfrozen and can move about freely.");

    }


}
