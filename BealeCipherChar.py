print("enter the string to parse:")
thestring = input()
thestring.strip()  #strips whitespace

index_needed = 0

while True:
    print("\nenter the index of the character you want (enter any character to stop):")
    try:
        input = input()
        intex_needed = int(input)
    except:
        break;

    charidx = index_needed - 1
    print("\n" + thestring[charidx])
