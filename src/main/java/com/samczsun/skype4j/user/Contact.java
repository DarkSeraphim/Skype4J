/*
 * Copyright 2015 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.skype4j.user;

import com.samczsun.skype4j.exceptions.ConnectionException;

import java.awt.image.BufferedImage;

/**
 * Represents a contact
 */
public interface Contact {
    /**
     * Get the username of this contact
     *
     * @return The username
     */
    String getUsername();

    /**
     * Get the displayname of this contact. Can return null if not found
     *
     * @return The displayname
     */
    String getDisplayName();

    /**
     * Get the first name of this contact. Can return null if not found
     *
     * @return The first name
     */
    String getFirstName();

    /**
     * Get the last name of this contact. Can return null if not found
     *
     * @return The last name
     */
    String getLastName();

    /**
     * Get the avatar as a {@link BufferedImage}. Can return null if not found.
     * Once the image is loaded it is cached
     * so if the first call suceeds it is implied no more exceptions will be thrown
     *
     * @return A clone of the original BufferedImage
     * @throws ConnectionException If an error occurs while fetching the original image
     */
    BufferedImage getAvatarPicture() throws ConnectionException;

    /**
     * Get the avatar as a URL. Can return null if not found.
     *
     * @return The URL to the avatar
     */
    String getAvatarURL();

    /**
     * Get the mood of this contact. Can return null if not found
     *
     * @return The mood
     */
    String getMood();

    /**
     * Get the mood as richtext of this contact. Can return null if not found
     *
     * @return The mood as richtext
     */
    String getRichMood();

    /**
     * Get the country this contact lives in. Can return null if not found
     *
     * @return The country
     */
    String getCountry();

    /**
     * Get the city this contact lives in. Can return null if not found
     *
     * @return The city
     */
    String getCity();
}
