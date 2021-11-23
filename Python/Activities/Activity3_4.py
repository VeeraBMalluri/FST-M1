
Player1 = input("Enter the name of Player 1 ")
Player2 = input("Enter the name of Player 2 ")
item = ['rock', 'scissors','paper']
start = input("Shall we start the game - Enter yes or no : ")
while start == 'yes':
    print(item)
    player1_item = input(Player1 + " pick one item from the item list ") 
    player2_item = input(Player2 + " pick one item from the item list ") 

    if player1_item == item[0]:
        if player2_item == item[0]:
            print("No Result - Draw")
        elif player2_item == item[1]:
            print(Player1 + " wins")
        else:
            print(Player2 +" wins")
    elif player1_item == item[1]:
        if player2_item == item[1]:
            print("No Result - Draw")
        elif player2_item == item[0]:
            print(Player1 + " wins")
        else:
            print(Player2 +" wins")
    elif player1_item == item[2]:
        if player2_item == item[2]:
            print("No Result - Draw")
        elif player2_item == item[1]:
            print(Player2 + " wins")
        else:
            print(Player1 +" wins")
    else:
        print("Enter a valid input")
    restart = input("Shall we continue - enter yes or no : ")
    if restart == 'no':
        break



        



