package ua.sviatkuzbyt.holidayapp.ui.elements.list

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.R
import ua.sviatkuzbyt.holidayapp.ui.elements.basic.MainButton
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun LazyItemScope.ErrorItem(
    @StringRes message: Int,
    onRetryClick: (() -> Unit)? = null
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillParentMaxSize()
    ){
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_error),
            contentDescription = stringResource(R.string.error),
            tint = AppTheme.colors.textPrimary
        )

        Text(
            text = stringResource(message),
            style = AppTheme.types.basic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 48.dp)
        )

        onRetryClick?.let {
            MainButton(
                modifier = Modifier.padding(top = 32.dp),
                text = stringResource(R.string.retry),
                onClick = onRetryClick
            )
        }
    }
}