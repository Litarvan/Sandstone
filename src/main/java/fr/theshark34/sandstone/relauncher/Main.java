/*
 * Copyright 2015 TheShark34
 *
 * This file is part of Sandstone.

 * Sandstone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Sandstone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Sandstone.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.theshark34.sandstone.relauncher;

import java.io.File;

/**
 * The Main class
 *
 * <p>
 *     It checks the arguments, print some beautiful messages, then launch the relauncher.
 * </p>
 *
 * @version 1.0.0-SNAPSHOT
 * @author TheShark34
 */
public class Main {

    /**
     * The Sandstone Re-Launcher version
     */
	public static final String VERSION = "1.0.0-SNAPSHOT";

    /**
     * The Re-Launcher instance
     */
    private static SandstoneReLauncher reLauncher;

	public static void main(String[] args) {
        // Printing the beautiful welcome message :3
        printWelcomeMessage();

        // If there isn't one argument
		if(args.length != 1)
            // Printing the help
			printHelp();

        // Else if there is one argument
        else
            // Starting
            start(args[0]);
	}

    /**
     * Print a beautiful welcome message :3
     */
    public static void printWelcomeMessage() {
        System.out.println("-- Sandstone version " + VERSION + " by TheShark34 --");
        System.out.println("  - Brining forge-like ASM to Bukkit\n");
    }

    /**
     * Print the help
     */
    public static void printHelp() {
        System.err.println("ERR: You need to provide one argument, the jar file you want to use (your bukkit/spigot/etc... jar)");
        System.err.println("Like this : java -jar sandstone-" + VERSION + ".jar <yourjar>");
        System.err.println("<yourjar> can be something like spigot-1.8.3-SNAPSHOT-R0.1.jar");
    }

    /**
     * Start the Re-Launcher
     *
     * @param jar
     *           The jar given in argument
     */
    public static void start(String jar) {
        // Getting the given jar file
        File jarFile = new File(jar);

        // If it doesn't exists
        if(!jarFile.exists()) {
            // Printing a message
            System.err.println("ERR: The given jar file doesn't exist, stopping...");

            // Stopping
            System.exit(0);
        }

        // Creating the Re-Launcher
        reLauncher = new SandstoneReLauncher(jarFile);

        // Printing a message
        System.out.println("Starting the Re-Launcher...");

        // Starting the Re-Launcher
        reLauncher.start();
    }

    /**
     * Returns the Re-Launcher instance
     *
     * @return The Re-Launcher
     */
    public static SandstoneReLauncher getReLauncher() {
        return reLauncher;
    }

}