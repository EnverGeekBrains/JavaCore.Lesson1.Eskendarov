package ru.eskendarov.ea.homework;

class Course {
    private int[] obs;

    Course(int[] obs) {
        this.obs = obs;
    }

    void doIt(Team st) {
        for (int i = 0; i < st.opp.length; i++) {
            int max = 0;
            for (int j : obs) {
                if (j > max) {
                    max = j;
                }  // вычислим макс. препятствие
            }
            if (st.opp[i] > max) {
                st.idWinner[i] = 1;
            } // если возможность превышает препятствие, записываем победителя
        }
    }
}
