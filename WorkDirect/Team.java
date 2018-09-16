package ru.eskendarov.ea.HomeWork_1;

class Team {
    int[] opp;
    String[] team;
    int[] idWinner = {0, 0, 0, 0};

    public Team(int[] opp) {
        this.opp = opp;
    }

    Team(String[] team) {
        this.team = team;
        opp = new int[team.length];
        for (int i = 0; i < team.length; i++) {
            opp[i] = (int) (Math.random() * 900);
        }
    }

    void showResultsWin() {
        System.out.println("Information about winners:");
        for (int i = 0; i < team.length; i++) {

            if (idWinner[i] != 0) {
                System.out.println(team[i] + " did It!");
            }

        }

    }

    void showResults() {
        System.out.println("Information about all players:");
        for (int i = 0; i < team.length; i++) {

            if (idWinner[i] != 0) {
                System.out.println(team[i] + " did It!");
            } else System.out.println(team[i] + " didn't It!");

        }

    }

}
