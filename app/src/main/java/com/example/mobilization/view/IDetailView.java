package com.example.mobilization.view;

import com.example.mobilization.model.data.Artist;

/**
 * Интерфейс экрана, с подробным описанием исполнителя.
 * loadDataFromIntent() - получение данных, переданных с интента
 * showData(Artist artist) - вывод данных на экран
 */
public interface IDetailView extends IView{
    Artist loadDataFromIntent();
    void showData(Artist artist);
    void openUrl(String url);
    void showError();
}
