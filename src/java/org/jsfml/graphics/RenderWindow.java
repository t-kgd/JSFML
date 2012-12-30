package org.jsfml.graphics;

import org.jsfml.NotNull;
import org.jsfml.system.Vector2f;
import org.jsfml.system.Vector2i;
import org.jsfml.window.ContextSettings;
import org.jsfml.window.VideoMode;
import org.jsfml.window.Window;

import java.util.Objects;

/**
 * Provides a window that can serve as a target for 2D drawing.
 */
public class RenderWindow extends Window implements RenderTarget {
    private final ConstView defaultView;
    private ConstView view;

    /**
     * Constructs a new render window without actually creating (opening) it.
     *
     * @see RenderWindow#create(org.jsfml.window.VideoMode, String, int, org.jsfml.window.ContextSettings)
     */
    public RenderWindow() {
        super();

        defaultView = new View(nativeGetDefaultView());
        view = defaultView;
    }

    @Deprecated
    @SuppressWarnings("deprecation")
    RenderWindow(long ptr) {
        super(ptr);

        defaultView = new View(nativeGetDefaultView());
        view = defaultView;
    }

    /**
     * Constructs a new render window and creates it with the specified parameters.
     *
     * @param mode     the video mode to use for rendering.
     * @param title    the window title.
     * @param style    the window style.
     * @param settings the settings for the OpenGL context.
     * @see #create(org.jsfml.window.VideoMode, String, int, org.jsfml.window.ContextSettings)
     */
    public RenderWindow(@NotNull VideoMode mode, @NotNull String title, int style, @NotNull ContextSettings settings) {
        this();
        create(mode, title, style, settings);
    }

    /**
     * Constructs a new render window and creates it with default context settings.
     *
     * @param mode  the video mode to use for rendering.
     * @param title the window title.
     * @param style the window style.
     * @see #create(org.jsfml.window.VideoMode, String, int)
     */
    public RenderWindow(@NotNull VideoMode mode, @NotNull String title, int style) {
        this();
        create(mode, title, style, new ContextSettings());
    }

    /**
     * Constructs a new render window and creates it with default style and context settings.
     *
     * @param mode  The video mode to use for rendering.
     * @param title The window title.
     */
    public RenderWindow(@NotNull VideoMode mode, @NotNull String title) {
        this();
        create(mode, title, DEFAULT, new ContextSettings());
    }

    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    protected native long nativeCreate();

    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    protected native void nativeSetExPtr();

    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    protected native void nativeDelete();

    private native void nativeClear(Color color);

    @Override
    public void clear(@NotNull Color color) {
        nativeClear(Objects.requireNonNull(color));
    }

    /**
     * Clears the target with black.
     */
    public void clear() {
        nativeClear(Color.BLACK);
    }

    private native void nativeSetView(View view);

    @Override
    public void setView(@NotNull ConstView view) {
        this.view = Objects.requireNonNull(view);
        nativeSetView((View) view);
    }

    @Override
    public ConstView getView() {
        return view;
    }

    private native long nativeGetDefaultView();

    @Override
    public ConstView getDefaultView() {
        return defaultView;
    }

    private native IntRect nativeGetViewport(View view);

    @Override
    public IntRect getViewport(@NotNull View view) {
        return nativeGetViewport(Objects.requireNonNull(view));
    }

    private native Vector2f nativeMapPixelToCoords(Vector2i point, View view);

    @Override
    public final Vector2f mapPixelToCoords(@NotNull Vector2i point) {
        return mapPixelToCoords(point, null); //null is handled in C code
    }

    @Override
    public Vector2f mapPixelToCoords(@NotNull Vector2i point, View view) {
        return nativeMapPixelToCoords(Objects.requireNonNull(point), view);
    }

    private native Vector2i nativeMapCoordsToPixel(Vector2f point, View view);

    @Override
    public final Vector2i mapCoordsToPixel(@NotNull Vector2f point) {
        return mapCoordsToPixel(point, null); //null is handled in C code
    }

    @Override
    public Vector2i mapCoordsToPixel(@NotNull Vector2f point, View view) {
        return nativeMapCoordsToPixel(Objects.requireNonNull(point), view);
    }

    @Override
    public final void draw(Drawable drawable) {
        draw(drawable, RenderStates.DEFAULT);
    }

    @Override
    public void draw(@NotNull Drawable drawable, @NotNull RenderStates renderStates) {
        drawable.draw(this, renderStates);
    }

    @Override
    public final void draw(Vertex[] vertices, PrimitiveType type) {
        draw(vertices, type, RenderStates.DEFAULT);
    }

    private native void nativeDraw(Vertex[] vertices, PrimitiveType type, RenderStates states);

    @Override
    public void draw(@NotNull Vertex[] vertices, @NotNull PrimitiveType type, @NotNull RenderStates states) {
        nativeDraw(
                Objects.requireNonNull(vertices),
                Objects.requireNonNull(type),
                Objects.requireNonNull(states));
    }

    @Override
    public native void pushGLStates();

    @Override
    public native void popGLStates();

    @Override
    public native void resetGLStates();
}
