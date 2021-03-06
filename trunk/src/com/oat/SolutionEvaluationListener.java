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
package com.oat;

/**
 * Date: 10/03/2006<br/>
 * <br/>
 * Description: An object interested on solution evaluation events on a problem
 * <br/>
 * @author Jason Brownlee
 * 
 * <pre>
 * Change History
 * ----------------------------------------------------------------------------
 * 25/12/2006   JBrownlee   Renamed the class name and event method
 *                          to something more meaningful                 
 * </pre>
 */
public interface SolutionEvaluationListener
{
    /**
     * Event raised each time a solution is evaluated
     * @param evaluatedSolution
     */
    void solutionEvaluatedEvent(Solution evaluatedSolution);
}
