class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int eliminatedPlayers = 0;

        if (isGreenLight == false) {

        if (speedOfPlayer1 > 0) {
            eliminatedPlayers += 1;
        }

        if (speedOfPlayer2 > 0) {
            eliminatedPlayers += 1;
        }

        if (speedOfPlayer3 > 0) {
            eliminatedPlayers += 1;
        }

        System.out.println ("Красный свет. Количество выбывших игроков: " + eliminatedPlayers);
        }

        else {
            System.out.println ("Зеленый свет. Выбывает " + eliminatedPlayers + " игроков");
        }

    }


    // Допишите здесь логику так, что будет подсчитано и выведено
    // количество игроков, которые выбывают.
    // Если свет зелёный, то проходят все игроки (0 выбывают).
    // Если свет красный, то выбывает каждый, чья скорость не 0.
}