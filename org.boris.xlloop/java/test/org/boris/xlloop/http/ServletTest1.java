/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.xlloop.http;

import java.util.Properties;

import org.boris.xlloop.ServerTest1;

import se.rupy.http.Daemon;

public class ServletTest1
{
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.put("delay", "60");
        p.put("verbose", "true");
        Daemon d = new Daemon(p);
        FunctionServlet servlet = new FunctionServlet();
        servlet.setHandler(ServerTest1.createHandler());
        ServletContainer f = new ServletContainer("/", servlet);
        d.add(f);
    }
}
