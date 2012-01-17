/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_jsfml_audio_SoundBuffer */

#ifndef _Included_org_jsfml_audio_SoundBuffer
#define _Included_org_jsfml_audio_SoundBuffer
#ifdef __cplusplus
extern "C" {
#endif
/* Inaccessible static: debug */
/* Inaccessible static: numManaged */
/* Inaccessible static: numWrapped */
/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    nativeCreate
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_jsfml_audio_SoundBuffer_nativeCreate
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    nativeDelete
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_jsfml_audio_SoundBuffer_nativeDelete
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    nativeCopy
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_jsfml_audio_SoundBuffer_nativeCopy
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    nativeLoadFromMemory
 * Signature: ([B)Z
 */
JNIEXPORT jboolean JNICALL Java_org_jsfml_audio_SoundBuffer_nativeLoadFromMemory
  (JNIEnv *, jobject, jbyteArray);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    nativeLoadFromSamples
 * Signature: ([SII)Z
 */
JNIEXPORT jboolean JNICALL Java_org_jsfml_audio_SoundBuffer_nativeLoadFromSamples
  (JNIEnv *, jobject, jshortArray, jint, jint);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    nativeSaveToFile
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_jsfml_audio_SoundBuffer_nativeSaveToFile
  (JNIEnv *, jobject, jstring);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    getSamples
 * Signature: ()[S
 */
JNIEXPORT jshortArray JNICALL Java_org_jsfml_audio_SoundBuffer_getSamples
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    getSampleCount
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_jsfml_audio_SoundBuffer_getSampleCount
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    getSampleRate
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_jsfml_audio_SoundBuffer_getSampleRate
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    getChannelCount
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_jsfml_audio_SoundBuffer_getChannelCount
  (JNIEnv *, jobject);

/*
 * Class:     org_jsfml_audio_SoundBuffer
 * Method:    getDuration
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_jsfml_audio_SoundBuffer_getDuration
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif