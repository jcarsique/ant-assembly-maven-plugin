/*
 * (C) Copyright 2006-2014 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     bstefanescu
 */
package org.nuxeo.build.maven.filter;

/**
 * TODO NXBT-258
 */
public class ExactMatch extends SegmentMatch {

    public String segment;

    public ExactMatch(String segment) {
        this.segment = segment;
    }

    @Override
    public boolean match(String segmentToMatch) {
        return this.segment.equals(segmentToMatch);
    }

    @Override
    public String toString() {
        return getClass().toString() + " (" + segment + ")";
    }

}
