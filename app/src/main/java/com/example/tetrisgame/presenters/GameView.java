package com.example.tetrisgame.presenters;

public interface GameView {
    void init(int gameSize);
    void draw(Point[][] points);
    void setScore(int score);
    void setStatus(GameStatus status);
}