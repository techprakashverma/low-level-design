package com.pv.lowlevaldesign.TicTacToe.model;

public class Player {

    public String name;
    public PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public Player setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
        return this;
    }
}
