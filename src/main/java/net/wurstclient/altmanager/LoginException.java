/*
 * Copyright (c) 2014-2025 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.altmanager;

public final class LoginException extends Exception
{
	public LoginException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public LoginException(String message)
	{
		super(message);
	}
}
