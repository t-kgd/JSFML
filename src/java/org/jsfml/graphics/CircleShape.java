package org.jsfml.graphics;

import org.jsfml.system.Vector2f;

/**
 * A specialized shape representing a circle.
 */
public class CircleShape extends Shape {
    /**
     * Creates a new circle shape with a zero radius approximated using 30 points.
     */
    public CircleShape() {
        super();
    }

    /**
     * Creates a new circle shape approximated using 30 points.
     *
     * @param radius The circle's radius in pixels.
     */
    public CircleShape(float radius) {
        this();
        setRadius(radius);
    }


    /**
     * Creates a new circle shape approximated using 30 points.
     *
     * @param radius The circle's radius in pixels.
     * @param points The amount of points to approximate the circle with.
     * @see CircleShape#setPointCount(int)
     */
    public CircleShape(float radius, int points) {
        this(radius);
        setPointCount(points);
    }

    @Override
    protected native long nativeCreate();

    /**
     * Sets the radius of this circle.
     *
     * @param radius The new radius of the circle in pixels.
     */
    public native void setRadius(float radius);

    /**
     * Gets the radius of this circle.
     *
     * @return The radius of this circle in pixels.
     */
    public native float getRadius();

    /**
     * Sets the amount of points the circle should be approximated with.
     * <p/>
     * A higher amount of points will yield a smoother result at the cost of performance.
     *
     * @param count The amount of points used to approximate the circle.
     */
    public native void setPointCount(int count);

    private native void nativeSetTexture(Texture texture, boolean resetRect);

    @Override
    public void setTexture(Texture texture, boolean resetRect) {
        nativeSetTexture(texture, resetRect);
        super.setTexture(texture, resetRect);
    }

    @Override
    native void nativeSetTextureRect(IntRect rect);

    @Override
    native void nativeSetFillColor(Color color);

    @Override
    native void nativeSetOutlineColor(Color color);

    @Override
    public native void setOutlineThickness(float thickness);

    @Override
    public native IntRect getTextureRect();

    @Override
    public native Color getFillColor();

    @Override
    public native Color getOutlineColor();

    @Override
    public native float getOutlineThickness();

    @Override
    public native int getPointCount();
    @Override
    native Vector2f nativeGetPoint(int i);

    @Override
    public native FloatRect getLocalBounds();

    @Override
    public native FloatRect getGlobalBounds();

    @Override
    public native void setPosition(float x, float y);

    @Override
    public native void setRotation(float angle);

    @Override
    public native void setScale(float x, float y);

    @Override
    public native void setOrigin(float x, float y);

    @Override
    public native Vector2f getPosition();

    @Override
    public native float getRotation();

    @Override
    public native Vector2f getScale();

    @Override
    public native Vector2f getOrigin();

    @Override
    public native void move(float x, float y);

    @Override
    public native void rotate(float angle);

    @Override
    public native void scale(float x, float y);

    @Override
    public native Transform getTransform();

    @Override
    public native Transform getInverseTransform();
}