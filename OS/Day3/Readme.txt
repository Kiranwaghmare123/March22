Tips for Using the VI Editor
Visual editor (vi) was the first full-screen, WYSIWYG text editor for unix. Its commands are very cryptic, which is typical unix, but it is universally available on vitually every unix machine.

vi has two modes, command mode and edit mode. In command mode, keystrokes are interpreted as commands, e.g., page down, delete line, save document. In edit mode, keystrokes are added direcly to the text of the document. (A third mode, last line mode, allows lengthy commands to be entered on the bottom line of the screen.)

vi is started with
% vi
or
% vi {filename}
and begins in command mode.

The following documents a minimal set of vi commands needed to do basic text editing.

Moving Around:
cursor keys - move one character in cursor direction
h, j, k, l - left, down, up, right
w, b - forward, back one word
0, $ - start, end of current line
ctrl-F, ctrl-B - forward, back one screen
1G, G - top, bottom of file

Entering Text:
i - enter insert mode before cursor
a - enter insert mode after cursor
o - enter insert mode new line after current line
O - enter insert mode new line before current line
ctrl-H - erase last typed character (screen does not update)
ESC - exit insert mode and return to command mode
Note that cursor keys work erratically in insert mode. (They work until one tries to move to a location where there is no valid text, e.g., past the end of a line. Then one is automatically escaped to command mode.)

Note that ctrl-H works only in insert mode. It applies only to the most recently typed characters. Although the cursor moves back, the screen does not update when characters are erased.

Cut (delete), Copy (yank), and Paste (put):
x - delete character at cursor
X - delete character before cursor
dd - delete current line into buffer
#dd - delete # lines into buffer
yy - copy current line into buffer
#yy - copy # lines into buffer
p - paste buffer (or deleted) text at (before) cursor
P - paste buffer (or deleted) text after cursor

Search and Replace:
/pattern, ?pattern - find next, previous occurance of "pattern"
:s/old/new/g - replace "old" with "new" on current line
:1,$s/old/new/g - replace "old" with "new" in entire file

File Manipulation:
:w - save (write) file
:w filename - save as "filename"
:wq - save and exit (quit)
:q! - exit without saving

Other:
:r filename - insert (read) contents of "filename" after current line
:set number - display line numbers (not part of document)
:set nonumber - do not display line numbers

For additional commands see the manual page at

% man vi
