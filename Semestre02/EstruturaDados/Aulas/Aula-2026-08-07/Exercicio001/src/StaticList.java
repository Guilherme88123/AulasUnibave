public class StaticList
{
    private int[] _array = new int[10];
    private int _size = 0;

    public boolean Add(int item)
    {
        if (_size >= _array.length)
            return false;

        _array[_size] = item;
        _size++;

        return true;
    }

    public int GetIndex(int item)
    {
        int position = -1;

        for (int i = 0; i < _size; i++)
        {
            if (_array[i] == item)
            {
                position = i;
                break;
            }
        }

        return position;
    }

    public boolean DeleteByIndex(int indexRemove)
    {
        if (indexRemove >= _size)
            return false;

        for (int i = indexRemove; i < _size - 1; i++)
        {
            _array[i] = _array[i + 1];
        }
        _size--;

        return true;
    }

    public int[] GetAll()
    {
        int[] list = new int[_size];

        for (int i = 0; i < _size; i++)
            list[i] = _array[i];

        return list;
    }

    public int GetMax()
    {
        if (_size == 0)
            return -1;

        int max = 0;

        for (int i = 0; i < _size; i++)
        {
            if (i == 0)
            {
                max = _array[i];
                continue;
            }

            if (_array[i] > max)
                max = _array[i];
        }

        return max;
    }
    public int GetMin()
    {
        if (_size == 0)
            return -1;

        int min = 0;

        for (int i = 0; i < _size; i++)
        {
            if (i == 0)
            {
                min = _array[i];
                continue;
            }

            if (_array[i] < min)
                min = _array[i];
        }

        return min;
    }
}
