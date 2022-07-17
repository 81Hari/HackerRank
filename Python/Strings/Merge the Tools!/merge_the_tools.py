import textwrap
def merge_the_tools(string, k):
    wrapper = textwrap.TextWrapper(width=k)
    string = wrapper.wrap(text=string)
    t = ""
    for i in string:
        t = t + "".join(list(dict.fromkeys(list(i))))
        t = t + '\n'
    t = t[:len(t)-1]
    print(t)


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
