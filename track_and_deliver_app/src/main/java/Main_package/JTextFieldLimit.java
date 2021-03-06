package Main_package;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
class JTextFieldLimit extends PlainDocument {
   private int limit;
   JTextFieldLimit(int limit) {
      super();
      this.limit = limit;
   }
   JTextFieldLimit(int limit, boolean upper) {
      super();
      this.limit = limit;
   }
   @Override
   public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
      if (str == null)
         return;
      if ((getLength() + str.length()) <= limit) {
         super.insertString(offset, str, attr);
      }
   }
}
