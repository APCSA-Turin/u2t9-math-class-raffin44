public class CoinFlip {
    
    private CoinFlip() {

    }

    public String flip(){
        int num = (int) (Math.random()*2);
        if (num != 0){
            return "heads";
        }else{
            return "tails";
        }
    }

    public double simulate(int numberofFlips){
        int numHeads = 0;
        int numTails = 0;
        for (int i = 0; i < numberofFlips; i++) {
            String flip = flip();
            if (flip.equals("tails")) {
                numTails++;
            }else{
                numHeads++;
            }
        }
        double percentHead = (double) (numHeads)/numberofFlips;
        return percentHead; 
    }
}
