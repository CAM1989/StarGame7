package gb.ru.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import gb.ru.base.BaseButton;
import gb.ru.math.Rect;
import gb.ru.screen.GameScreen;

public class NewGameButton extends BaseButton {
    private GameScreen gameScreen;

    public NewGameButton(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
        this.gameScreen = gameScreen;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.05f);
        setTop(-0.01f);
    }

    public void action() {
        gameScreen.startNewGame();
    }
}
