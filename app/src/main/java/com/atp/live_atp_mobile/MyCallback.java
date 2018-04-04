package com.atp.live_atp_mobile;

import android.net.Uri;

/**
 * Created by cesar on 22/03/2018.
 */

public abstract class MyCallback {
    void onCallbackTournament(String nameTournament, String dateTournament) {
    }
    void onCallbackUser(int idRencontre, String user, String passwordUser) {
    }
    void onCallbackMatch(boolean equipe, int idTableau, int idTour, int player1, int player2, int idTeam1, int idTeam2) {
    }
    void onCallbackStateTournament(String nameTour) {
    }
    void onCallbackBoard(int idCategory) {
    }
    void onCallbackCategory(String nameCategory) {
    }
    void onCallbackPlayer1(int idPlayer1, String firstNamePlayer, String lastNamePlayer, String codeNationality) {
    }
    void onCallbackPlayer2(int idPlayer2, String firstNamePlayer, String lastNamePlayer, String codeNationality) {
    }
    void onCallbackTeam1(String codeNationality, int idPlayer1, int idPlayer2, String nameTeam) {
    }
    void onCallbackTeam2(String codeNationality, int idPlayer1, int idPlayer2, String nameTeam) {
    }
    void onCallbackCodeCountryJ1(String libelleCode) {
    }
    void onCallbackCodeCountryJ2(String libelleCode) {
    }
    void onCallbackNationalityJ1(Uri libelleNationality) {
    }
    void onCallbackNationalityJ2(Uri libelleNationality) {
    }
}
