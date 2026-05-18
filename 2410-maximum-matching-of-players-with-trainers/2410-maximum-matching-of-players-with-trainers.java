class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pp=0;
        int tp=0;
        int c=0;
        while(pp<players.length && tp<trainers.length){
            if(players[pp]<=trainers[tp]){
                c++;
                pp++;
                tp++;
            }else{
                tp++; 
            }
        }
        return c;
    }
}