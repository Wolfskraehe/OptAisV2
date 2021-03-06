/*
Optimization Algorithm Toolkit (OAT)
http://sourceforge.net/projects/optalgtoolkit
Copyright (C) 2006  Jason Brownlee

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.oat.explorer.domains.cfo.gui.entry;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;

import com.oat.explorer.domains.cfo.gui.panels.CFOMasterPanel;
import com.oat.explorer.gui.entry.ExplorerApplet;

/**
 * Type: FuncOptMainFrame<br/>
 * Date: 24/11/2006<br/>
 * <br/>
 * Description:
 * <br/>
 * @author Jason Brownlee
 * 
 * <pre>
 * Change History
 * ----------------------------------------------------------------------------
 * 
 * </pre>
 */
public class CFOMainApplet extends ExplorerApplet
{
    @Override
    protected void prepareGui()
    {
        JTabbedPane tp = new JTabbedPane();        
        tp.add(new CFOMasterPanel());
        getContentPane().add(tp, BorderLayout.CENTER);
    }
}
