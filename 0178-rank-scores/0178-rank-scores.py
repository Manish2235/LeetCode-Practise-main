import pandas as pd

def order_scores(scores: pd.DataFrame) -> pd.DataFrame:
    scores_sorted = scores.sort_values('score', ascending=False)
    scores_sorted['rank'] = scores_sorted['score'].rank(method='dense', ascending=False).astype(int)
    result = scores_sorted[['score', 'rank']]
    return result