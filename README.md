# ShoppingList
Mobile Programming Assigment #1
Create an Android application called "ShoppingList".

The layout has an EditText-view and two buttons, Save and Done.

When user inputs a shopping item into the EditText-field and presses Save, the length of the text is checked.

If the length of item entered in EditText-field is shorter than 3 letters or longer than 15 letters a Toast is displayed to inform the user of an error. If the length is correct, the item written in EditText is added to a list (ArrayList) in the code and user is notified about this in a different Toast.

When Done-button is pressed, the program opens a new Activity called ShowList. Showlist has one Button with text "Back" and one TextView in it's layout. The list user entered, and saved in to the code in first activity is displayed now in the TextView of ShowList-activity.

When user presses the Back-button, an AlertDialog is displayed to confirm his decision to finish (close) this activity and return to the previous activity (ShoppingList).

Pressing the positive button (yes, ok, whatever) closes the AlertDialog and closes the current activity returning to the original ShoppingList-activity.

Functions and classes important in this assignment:

TextView - View component to display text.

EditText - View component to display and edit text.

Toast - A small popup text to show on screen.

AlertDialog.Builder - A larger popup with more complex layout. AlertDialogs are constructed in Builder-pattern.

Intent - Intents are a way to tell to the OS what to do outside of current activity (i.e. starting new activities: Intent i = new Intent(ClassName.class);

startActivity(Intent i);

finish();

findViewById(R.id.yourComponentId);  - Connect UI components to objects in code.

getApplicationContext();

View.setOnClickListener();

ProTip: In newer API versions when giving the Context in the constructor function of AlertDialog, the correct context to give is this or YourActivity.this. This is a compatibility bug in older user interface-components like AlertDialog.
