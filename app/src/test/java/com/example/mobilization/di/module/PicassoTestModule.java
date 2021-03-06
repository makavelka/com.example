package com.example.mobilization.di.module;

import com.example.mobilization.di.modules.PicassoModule;
import com.example.mobilization.model.api.PicassoService;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Модуль, предоставляющий экземпляр класса Picasso, который используется для загрузки изображений
 */
@Module
public class PicassoTestModule extends PicassoModule {
    @Provides
    @Singleton
    Picasso providePicasso() {
        return new PicassoService().getPicasso();
    }
}
