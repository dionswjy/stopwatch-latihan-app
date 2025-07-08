/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uas.stopwatch.latihan.app;

import com.uas.stopwatch.latihan.app.view.LoginFrame;

/**
 *
 * @author LENOVO
 */
public class StopwatchLatihanApp {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}
