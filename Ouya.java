package org.renpy.android;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import tv.ouya.console.api.OuyaController;

public class Ouya {

	static int MAX_CONTROLLERS = 4;

	/**
	 * Returns false boolean array
	 */
	private static boolean[] getBooleanArray() {
		boolean[] array = new boolean[MAX_CONTROLLERS];
		return array;
	}
	
	/**
	 * Returns 0.00 float array
	 */
	private static float[] getFloatArray() {
		float[] array = new float[MAX_CONTROLLERS];
		return array;
	}
	
	static boolean[] BUTTON_MENU = getBooleanArray();

	static boolean[] BUTTON_O = getBooleanArray();
	static boolean[] BUTTON_U = getBooleanArray();
	static boolean[] BUTTON_Y = getBooleanArray();
	static boolean[] BUTTON_A = getBooleanArray();

	static boolean[] BUTTON_DPAD_UP = getBooleanArray();
	static boolean[] BUTTON_DPAD_DOWN = getBooleanArray();
	static boolean[] BUTTON_DPAD_LEFT = getBooleanArray();
	static boolean[] BUTTON_DPAD_RIGHT = getBooleanArray();
	
	static boolean[] BUTTON_L1 = getBooleanArray();
	static boolean[] BUTTON_L2 = getBooleanArray();
	static boolean[] BUTTON_L3 = getBooleanArray();
	static boolean[] BUTTON_R1 = getBooleanArray();
	static boolean[] BUTTON_R2 = getBooleanArray();
	static boolean[] BUTTON_R3 = getBooleanArray();
	
	static float[] AXIS_LS_X = getFloatArray();
	static float[] AXIS_LS_Y = getFloatArray();
	static float[] AXIS_RS_X = getFloatArray();
	static float[] AXIS_RS_Y = getFloatArray();
	
	/**
	 * Sets BUTTON_MENU boolean state according to player ID
	 */
	public static void setBUTTON_MENU(int player, boolean state) {
        BUTTON_MENU[player] = state;
	}
	
	/**
	 * Sets BUTTON_O boolean state according to player ID
	 */
	public static void setBUTTON_O(int player, boolean state) {
        BUTTON_O[player] = state;
	}
    
	/**
	 * Sets BUTTON_U boolean state according to player ID
	 */
	public static void setBUTTON_U(int player, boolean state) {
        BUTTON_U[player] = state;
	}

	/**
	 * Sets BUTTON_Y boolean state according to player ID
	 */
	public static void setBUTTON_Y(int player, boolean state) {
        BUTTON_Y[player] = state;
	}
    
	/**
	 * Sets BUTTON_A boolean state according to player ID
	 */
	public static void setBUTTON_A(int player, boolean state) {
        BUTTON_A[player] = state;
	}
    
	/**
	 * Sets BUTTON_DPAD_UP boolean state according to player ID
	 */
	public static void setBUTTON_DPAD_UP(int player, boolean state) {
        BUTTON_DPAD_UP[player] = state;
	}
    
	/**
	 * Sets BUTTON_DPAD_DOWN boolean state according to player ID
	 */
	public static void setBUTTON_DPAD_DOWN(int player, boolean state) {
        BUTTON_DPAD_DOWN[player] = state;
	}
    
	/**
	 * Sets BUTTON_DPAD_LEFT boolean state according to player ID
	 */
	public static void setBUTTON_DPAD_LEFT(int player, boolean state) {
        BUTTON_DPAD_LEFT[player] = state;
	}
    
	/**
	 * Sets BUTTON_DPAD_RIGHT boolean state according to player ID
	 */
	public static void setBUTTON_DPAD_RIGHT(int player, boolean state) {
        BUTTON_DPAD_RIGHT[player] = state;
	}
	
	/**
	 * Sets BUTTON_L1 boolean state according to player ID
	 */
	public static void setBUTTON_L1(int player, boolean state) {
        BUTTON_L1[player] = state;
	}
	
	/**
	 * Sets BUTTON_L2 boolean state according to player ID
	 */
	public static void setBUTTON_L2(int player, boolean state) {
        BUTTON_L2[player] = state;
	}
	
	/**
	 * Sets BUTTON_L1 boolean state according to player ID
	 */
	public static void setBUTTON_L3(int player, boolean state) {
        BUTTON_L3[player] = state;
	}
	
	/**
	 * Sets BUTTON_R1 boolean state according to player ID
	 */
	public static void setBUTTON_R1(int player, boolean state) {
        BUTTON_R1[player] = state;
	}
	
	/**
	 * Sets BUTTON_R2 boolean state according to player ID
	 */
	public static void setBUTTON_R2(int player, boolean state) {
        BUTTON_R2[player] = state;
	}
	
	/**
	 * Sets BUTTON_L3 boolean state according to player ID
	 */
	public static void setBUTTON_R3(int player, boolean state) {
        BUTTON_R3[player] = state;
	}

	/**
	 * Sets AXIS_LS_X float value according to player ID
	 */
	public static void setAXIS_LS_X(int player, float value) {
        AXIS_LS_X[player] = value;
	}
	
	/**
	 * Sets AXIS_LS_Y float value according to player ID
	 */
	public static void setAXIS_LS_Y(int player, float value) {
        AXIS_LS_Y[player] = value;
	}
	
	/**
	 * Sets AXIS_RS_X float value according to player ID
	 */
	public static void setAXIS_RS_X(int player, float value) {
        AXIS_RS_X[player] = value;
	}
	
	/**
	 * Sets AXIS_RS_Y float value according to player ID
	 */
	public static void setAXIS_RS_Y(int player, float value) {
        AXIS_RS_Y[player] = value;
	}
    
	/**
	 * Gets BUTTON_MENU boolean state according to player ID
	 */
	public static boolean getBUTTON_MENU(int player) {
        return BUTTON_MENU[player];
	}
	
	/**
	 * Gets BUTTON_O boolean state according to player ID
	 */
	public static boolean getBUTTON_O(int player) {
        return BUTTON_O[player];
	}
    
	/**
	 * Gets BUTTON_U boolean state according to player ID
	 */
	public static boolean getBUTTON_U(int player) {
        return BUTTON_U[player];
	}

	/**
	 * Gets BUTTON_Y boolean state according to player ID
	 */
	public static boolean getBUTTON_Y(int player) {
        return BUTTON_Y[player];
	}
    
	/**
	 * Gets BUTTON_A boolean state according to player ID
	 */
	public static boolean getBUTTON_A(int player) {
        return BUTTON_A[player];
	}
    
	/**
	 * Gets BUTTON_DPAD_UP boolean state according to player ID
	 */
	public static boolean getBUTTON_DPAD_UP(int player) {
        return BUTTON_DPAD_UP[player];
	}
    
	/**
	 * Gets BUTTON_DPAD_DOWN boolean state according to player ID
	 */
	public static boolean getBUTTON_DPAD_DOWN(int player) {
        return BUTTON_DPAD_DOWN[player];
	}
    
	/**
	 * Gets BUTTON_DPAD_LEFT boolean state according to player ID
	 */
	public static boolean getBUTTON_DPAD_LEFT(int player) {
        return BUTTON_DPAD_LEFT[player];
	}
    
	/**
	 * Gets BUTTON_DPAD_RIGHT boolean state according to player ID
	 */
	public static boolean getBUTTON_DPAD_RIGHT(int player) {
        return BUTTON_DPAD_RIGHT[player];
	}
	
	/**
	 * Gets BUTTON_L1 boolean state according to player ID
	 */
	public static boolean getBUTTON_L1(int player) {
        return BUTTON_L1[player];
	}
	
	/**
	 * Gets BUTTON_L2 boolean state according to player ID
	 */
	public static boolean getBUTTON_L2(int player) {
        return BUTTON_L2[player];
	}
	
	/**
	 * Gets BUTTON_L3 boolean state according to player ID
	 */
	public static boolean getBUTTON_L3(int player) {
        return BUTTON_L3[player];
	}
	
	/**
	 * Gets BUTTON_R1 boolean state according to player ID
	 */
	public static boolean getBUTTON_R1(int player) {
        return BUTTON_R1[player];
	}
	
	/**
	 * Gets BUTTON_R2 boolean state according to player ID
	 */
	public static boolean getBUTTON_R2(int player) {
        return BUTTON_R2[player];
	}
	
	/**
	 * Gets BUTTON_R3 boolean state according to player ID
	 */
	public static boolean getBUTTON_R3(int player) {
        return BUTTON_R3[player];
	}
	
	/**
	 * Gets AXIS_LS_X float value
	 */
	public static float getAXIS_LS_X(int player) {
        return AXIS_LS_X[player];
	}
	
	/**
	 * Gets AXIS_LS_Y float value
	 */
	public static float getAXIS_LS_Y(int player) {
        return AXIS_LS_Y[player];
	}
	
	/**
	 * Gets AXIS_RS_X float value
	 */
	public static float getAXIS_RS_X(int player) {
        return AXIS_RS_X[player];
	}
	
	/**
	 * Gets AXIS_RS_Y float value
	 */
	public static float getAXIS_RS_Y(int player) {
        return AXIS_RS_Y[player];
	}
}
