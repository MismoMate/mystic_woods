package com.github.mismo.mysticwoods

import com.badlogic.gdx.Application
import com.badlogic.gdx.Gdx
import com.github.mismo.mysticwoods.screen.GameScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen

class MysticWoods : KtxGame<KtxScreen>() {

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG
        addScreen(GameScreen())
        setScreen<GameScreen>()
    }
}
