# ShoppingList
Mobile Programming Assigment #1
Create an Android application called "ShoppingList".

The layout has an EditText-view and two buttons, Save and Done.

When user inputs a shopping item into the EditText-field and presses Save, the length of the text is checked.

If the length of item entered in EditText-field is shorter than 3 letters or longer than 15 letters a Toast is displayed to inform the user of an error. If the length is correct, the item written in EditText is added to a list (ArrayList) in the code and user is notified about this in a different Toast.

When Done-button is pressed, the program opens a new Activity called ShowList. Showlist has one Button with text "Back" and one TextView in it's layout. The list user entered, and saved in to the code in first activity is displayed now in the TextView of ShowList-activity.

When user presses the Back-button, an AlertDialog is displayed to confirm his decision to finish (close) this activity and return to the previous activity (ShoppingList).

Pressing the positive button (yes, ok, whatever) closes the AlertDialog and closes the current activity returning to the original ShoppingList-activity.
