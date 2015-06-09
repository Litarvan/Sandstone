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
 * The Sandstone Re-Launcher
 *
 * <p>
 *     Organize all the launch. Loads the coreplugins using the loaders, create a repacked
 *     jar and classpath, then launch all.
 * </p>
 *
 * @version 1.0.0-SNAPSHOT
 * @author TheShark34
 */
public class SandstoneReLauncher {

    /**
     * The given bukkit/spigot/etc... jar to use
     */
    private File jar;

    /**
     * Sandstone Re-Launcher constructor
     *
     * @param jar
     *            The given bukkit/spigot/etc... jar to use
     */
    public SandstoneReLauncher(File jar) {
        this.jar = jar;
    }

    /**
     * Start the Re-Launcher
     */
    public void start() {
        // TODO: The Sandstone Re-Launcher :p
    }

}
