/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
*/
package org.pentaho.actionsequence.dom;

import org.dom4j.Element;

/**
 * Interface to be implement by objects that wrap action sequence elements
 * @author Angelo Rodriguez
 *
 */
public interface IActionSequenceElement {

  /**
   * @return the action sequence element wrapped by this object
   */
  public Element getElement();
  
  /**
   * Removes the element from the action sequence 
   */
  public void delete();
  
  /**
   * @return an action sequence document that wraps the dom document containing
   * the element wrapped by this object.
   */
  public ActionSequenceDocument getDocument();
}
