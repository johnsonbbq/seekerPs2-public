package com.seeker.ps2;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

final class AboutDialogHelper {
    private static final String ABOUT_TEXT =
            "SeekerPS2\n" +
            "The Premier PS2 Emulation Layer for Solana Seeker\n\n" +
            "Introduction\n" +
            "SeekerPS2 is a specialized PlayStation 2 emulator built exclusively for the Solana Seeker. " +
            "Optimized for the Seeker's unique hardware environment, this project aims to deliver a seamless, " +
            "high-performance retro gaming experience on the go. By leveraging modern mobile architecture, " +
            "SeekerPS2 bridges the gap between classic console gaming and the next generation of mobile hardware.\n\n" +
            "Intellectual Property & Legal Notice\n" +
            "User Responsibility: SeekerPS2 is a software tool only. It does not include PlayStation 2 BIOS files, " +
            "game ROMs, or ISOs.\n\n" +
            "Copyrights: All PlayStation 2 system software, BIOS, and game content remain the exclusive property " +
            "of their respective copyright owners (Sony Interactive Entertainment and game publishers).\n\n" +
            "Acquisition: Users must provide their own legally obtained BIOS files and game backups. We do not support " +
            "or condone the use of pirated software.\n\n" +
            "Terms & Contact\n" +
            "License\n" +
            "This project is licensed under the GNU General Public License (GPL). You are free to share and modify " +
            "the software under the terms of this license.\n\n" +
            "Privacy\n" +
            "Your data belongs to you. SeekerPS2 operates entirely offline; it does not collect, track, or transmit " +
            "any personal information or usage data.\n\n" +
            "Copyright\n" +
            "\u00a9 2026 SeekerPS2 Developers.\n\n" +
            "Contact\n" +
            "For technical inquiries or feedback, please contact:\n" +
            "contact-removed@example.invalid";

    private AboutDialogHelper() {}

    static void show(Context context) {
        TextView contentView = new TextView(context);
        int padding = Math.round(24 * context.getResources().getDisplayMetrics().density);
        contentView.setPadding(padding, padding, padding, padding / 2);
        contentView.setText(ABOUT_TEXT);
        contentView.setTextIsSelectable(true);
        contentView.setMovementMethod(new ScrollingMovementMethod());

        new MaterialAlertDialogBuilder(context)
                .setTitle("About SeekerPS2")
                .setView(contentView)
                .setPositiveButton("Close", null)
                .show();
    }
}
